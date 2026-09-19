SUMMARY = "Python module for ANSI color output and colored highlighting and diffing"
DESCRIPTION = "Ansicolor is a library that offers ANSI color markup for \
command line programs."
LICENSE = "Apache-2.0"

PV = "0.3.3"

RPM_NAME = "python313-ansicolor-0.3.3-1.4.noarch.rpm"
RPM_HASH = "3df75189fa358e10cc928bd70a7999c85aeb30059352b26abc0b5a66322a83ab455bfe08d42e87f8c1e09423ee5244a009b767be5c6944d749cf9b681a4ca7cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansicolor \
python3.13dist-ansicolor \
python313-ansicolor \
python3dist-ansicolor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
