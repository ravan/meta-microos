SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python314-defcon-0.12.2-1.4.noarch.rpm"
RPM_HASH = "fb1f13cc4e9ddd3c5ab6406fa13609dbd96b454dd492f3704a21b2dd615dffac928a7ce1a04bcfeb99afd9703d880226a4852f3190ebf55c58a0a916754bc6be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-defcon \
python314-defcon \
python3dist-defcon"

RDEPENDS:${PN} += "python-abi \
python314-FontTools \
python314-fs"

inherit rpm
