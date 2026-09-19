SUMMARY = "A Command-Line Interface framework"
DESCRIPTION = "A Command-Line Interface framework"
LICENSE = "MIT"

PV = "0.14.0"

RPM_NAME = "python314-knack-0.14.0-1.2.noarch.rpm"
RPM_HASH = "463c4aa6009df9feb1425b780ff0640c409b815ee4e36f7d1a697b6bbdcac4930499423e5900c4688c98f925be2a79a11892ebe3499f365cda8e929f364522ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-knack \
python314-knack \
python3dist-knack"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-argcomplete \
python314-jmespath \
python314-pygments \
python314-tabulate"

inherit rpm
