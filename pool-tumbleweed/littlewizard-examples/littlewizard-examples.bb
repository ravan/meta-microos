SUMMARY = "Example files for Little Wizard"
DESCRIPTION = "Little Wizard is created especially for primary school children. It allows to \
learn using main elements of present computer languages, including: variables, \
expressions, loops, conditions, logical blocks. Every element of language is \
represented by an intuitive icon. It allows program Little Wizard without \
using keyboard, only mouse. \
 \
This package contains example files for Little Wizard."
LICENSE = "SUSE-Public-Domain"

PV = "20071206"

RPM_NAME = "littlewizard-examples-20071206-15.24.noarch.rpm"
RPM_HASH = "301f9dddc793d6aa11ebe357725faebb2b2eb2ba9544b26460c45d26780b7e18a1e7bd38dbf367c6facc7122e89c98fba29d4ac1b791f47409ab78f1140bc92b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "littlewizard-examples"

RDEPENDS:${PN} += "littlewizard"

inherit rpm
