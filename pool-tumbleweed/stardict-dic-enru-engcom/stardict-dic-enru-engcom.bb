SUMMARY = "English-Russian dictionary of computer terms"
DESCRIPTION = "The open English-Russian dictionary of computer terms with more than 2000 articles in StarDict format. It is not an academic dictionary."
LICENSE = "GFDL-1.1"

PV = "1.36"

RPM_NAME = "stardict-dic-enru-engcom-1.36-20.24.noarch.rpm"
RPM_HASH = "83f1af8871250e684fefc641a9f507436cd200587e4ec6adaa53c8bae777f5f4c0c771ebfdeb63ef6b7feccdbd860202c5d0ebc7a3e2a6c070aeb8c055d9b48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-stardict-ru \
stardict-dic-enru-engcom"

RDEPENDS:${PN} += ""

inherit rpm
