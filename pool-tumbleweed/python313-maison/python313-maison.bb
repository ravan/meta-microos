SUMMARY = "Read settings from config files"
DESCRIPTION = "`maison` aims to provide a simple and flexible way to read and validate those \
configuration options so that they may be used in the package."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python313-maison-2.0.2-1.2.noarch.rpm"
RPM_HASH = "d5a8465547299ae80507534b8ae6d77216b213fe16f8aaad3d8b44c5fbb59d727b93c3ac77945cc92ba4ebc2b1a7b91eee1fe5feceedb69fe9a7a29b4cd5f3ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-maison \
python3.13dist-maison \
python313-maison \
python3dist-maison"

RDEPENDS:${PN} += "python-abi \
python313-loguru \
python313-platformdirs \
python313-typer \
python313-typing-extensions"

inherit rpm
