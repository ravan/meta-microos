SUMMARY = "Dropbox API interface"
DESCRIPTION = "A dropbox API interface"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.900.0"

RPM_NAME = "perl-Net-Dropbox-API-1.900.0-2.7.noarch.rpm"
RPM_HASH = "5675bd438c67332eb2f863df12309a532a3b70de7f379ee171ca7ea0a0dff09219e48a30b0e951a6012cba0d847a02063c1af28f62b19581271b7b5dce23896b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--Dropbox--API \
perl-Net-Dropbox-API"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Crypt--URandom \
perl-Data--Random \
perl-HTTP--Request--Common \
perl-JSON \
perl-LWP--UserAgent \
perl-Mouse \
perl-Net--OAuth \
perl-URI \
perl-common--sense"

inherit rpm
