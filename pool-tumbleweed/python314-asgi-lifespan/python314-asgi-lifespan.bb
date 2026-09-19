SUMMARY = "Programmatic startup/shutdown of ASGI apps"
DESCRIPTION = "Programmatic startup/shutdown of ASGI apps."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python314-asgi-lifespan-2.1.0-2.2.noarch.rpm"
RPM_HASH = "399088ef0099b468d15d39173f61b17ebd2a1b6aef120289e3fbe681a018e02d6a194ba5415a5ec5016096dc8155aa65fb261edd38095c95b82d55bd2063cc34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-asgi-lifespan \
python314-asgi-lifespan \
python3dist-asgi-lifespan"

RDEPENDS:${PN} += "python-abi \
python314-sniffio"

inherit rpm
