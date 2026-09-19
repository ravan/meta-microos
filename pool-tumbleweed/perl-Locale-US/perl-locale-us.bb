SUMMARY = "Two letter codes for state identification in the United States and vice versa"
DESCRIPTION = "Two letter codes for state identification in the United States and vice versa."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "3.04"

RPM_NAME = "perl-Locale-US-3.04-1.42.noarch.rpm"
RPM_HASH = "a53a3933cb32ff1549cf910c49c2d35deda355bf0f8f1e50d1ad67de3fd6a8267490b4a20e7e972d2bf2cd4f871e91631402dcbefcd509c83d2f0ee9c69999b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--US \
perl-Locale-US"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Data--Section--Simple"

inherit rpm
