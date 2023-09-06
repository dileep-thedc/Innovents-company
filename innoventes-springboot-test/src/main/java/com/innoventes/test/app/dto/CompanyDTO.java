package com.innoventes.test.app.dto;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	private Long id;

	@NotEmpty(message="Company Name Is madatory")
    @Size(min=5, message="Company name should be at least 5 character")
	@Column(name = "company_name")
	private String companyName;

    @NotEmpty(message="Email Name Is madatory")
    @Email(message="Invalid email format")
	@Column(name = "email")
	private String email;
	
    @PositiveOrZero(message=" Strength should be positive or zero")
	@Column(name = "strength")
	private Integer strength;
	
	@Column(name = "website_url")
	private String webSiteURL;
	
	@Pattern(regexp = "^[a-zA-Z]{2}\\d{2}[ENen]$", message = "Invalid company code format")
    private String companyCode;

}
