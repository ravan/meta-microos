SUMMARY = "English-Russian dictionary by professor V. K. Mueller"
DESCRIPTION = "English-Russian dictionary by professor V. K. Mueller, 7 edition with 46231 articles in StarDict format."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "stardict-dic-enru-mueller7-1.2-19.24.noarch.rpm"
RPM_HASH = "b530d2e557555fa62996c9a5accc0534e5bc2050fb69b474d207f68b1d8336e26e8da5aef9399a5216c78ea8f6a5c56cf44520ee4181abb39aa7663de58d6743"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-stardict-ru \
stardict-dic-enru-mueller7"

RDEPENDS:${PN} += ""

inherit rpm
