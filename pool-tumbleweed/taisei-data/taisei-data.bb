SUMMARY = "Data files for Taisei"
DESCRIPTION = "Data files for Taisei, an open clone of the Touhou Project series. Touhou is a \
one-man project of shoot ’em up games set in an isolated world full of \
Japanese folklore."
LICENSE = "MIT"

PV = "1.4.6"

RPM_NAME = "taisei-data-1.4.6-1.1.noarch.rpm"
RPM_HASH = "2b11bda18213fb44bbb9a6fe5315aa2140b0fa2ce58b563bf782a88dfb115c1e2b04f33d5796c5051aea91b471df88211e4f5bad592c82b3bbf99a9042bcef93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "taisei-data"

RDEPENDS:${PN} += "taisei"

inherit rpm
