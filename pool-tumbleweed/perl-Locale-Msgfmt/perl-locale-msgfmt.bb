SUMMARY = "Compile .po files to .mo files"
DESCRIPTION = "Compile .po files to .mo files"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.15"

RPM_NAME = "perl-Locale-Msgfmt-0.15-8.37.noarch.rpm"
RPM_HASH = "e37da5bf9297cd88120bef8c5d2556488d639c95b9ad95bd9146142fac7cca672f78deb6d1fc4dc1c44580985d33d59a0db43bdfa7679cf7150f502aa699fe7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Msgfmt \
perl-Locale--Msgfmt--Utils \
perl-Locale--Msgfmt--mo \
perl-Locale--Msgfmt--po \
perl-Locale-Msgfmt \
perl-Module--Install--Msgfmt"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
