SUMMARY = "Budgie Desktop Environment"
DESCRIPTION = "The Budgie Desktop is a feature-rich, modern desktop designed to keep out the way of the user."
LICENSE = "MIT"

PV = "20250305"

RPM_NAME = "patterns-budgie-budgie-20250305-2.4.aarch64.rpm"
RPM_HASH = "5e21072d66024738d47ca5f70fe50f3171c7879f605e112348f9de07001da308356d1c6990c263abf4239c967b463519a94d0dd9afdfcc03a6c9a5d270eb6850"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-budgie-budgie"

RDEPENDS:${PN} += "budgie-desktop \
pattern-"

inherit rpm
