SUMMARY = "Dependencies required for Adminer SQLite support"
DESCRIPTION = "Virtual package that requires dependencies needed for Adminer SQLite support"
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-sqlite-4.8.1-1.13.noarch.rpm"
RPM_HASH = "99d307821121d7f7ea59c7627f14c1e1deef5817a2dd6b79e55b930dedbefb63f682b701a45545c416dae2a66da239c2d554bad3e55bbb61432b7e20fc1853df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-database-support \
adminer-sqlite"

RDEPENDS:${PN} += "adminer \
php-sqlite"

inherit rpm
