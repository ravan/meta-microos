SUMMARY = "Bitstream Vera(tm) Truetype fonts"
DESCRIPTION = "The package contains the 'Vera' truetype fonts from Bitstream Inc."
LICENSE = "Bitstream-Vera"

PV = "1.10"

RPM_NAME = "bitstream-vera-fonts-1.10-316.10.noarch.rpm"
RPM_HASH = "516bd688da4095b11ccbdb600bccd5cbcd0d82cb27fc96876e61eaf6c5f235eebce89f0b6e167d95d19c38b5891f0dff4a5b5597100226c91645d670a76c83b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bitstream-vera \
bitstream-vera-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
