SUMMARY = "A code formatter written in, and written for Python"
DESCRIPTION = "Black is a code formatter written in Python, and reformats Python 2.x \
and 3.x code. \
 \
Black reformats entire files in place. It is not configurable. It \
does not take previous formatting into account. The coding style \
enforced is a PEP-8 subset, adheres to PEP-257, and otherwise passes \
the rules of the 'pycodestyle' checker. Black skips over blocks that \
start and end with '# fmt: off' and '# fmt: on', respectively. It \
also recognizes YAPF's block comments to the same effect."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python314-blue-0.9.1-7.5.noarch.rpm"
RPM_HASH = "151fd46895a82314269c56b07031c45e250922c788d7729208f3154689a406d293dcac58971e1cacac124b5b0e4d13aa7773ca22de2f2fda6195db75399ae541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-blue \
python314-blue \
python3dist-blue"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-black"

inherit rpm
