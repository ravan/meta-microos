SUMMARY = "A set of UFO based objects for use in font editing applications"
DESCRIPTION = "A set of UFO based objects optimized for use in font editing applications."
LICENSE = "MIT"

PV = "0.12.2"

RPM_NAME = "python313-defcon-0.12.2-1.4.noarch.rpm"
RPM_HASH = "fcc41ee6c99a40351b389d0205800294f8da0030519333a20e097066b2b79f528a4064f72c5d343720e6321b9b7a24bbd6c8005fbbbc6760e1e62ac2ea463c5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-defcon \
python3.13dist-defcon \
python313-defcon \
python3dist-defcon"

RDEPENDS:${PN} += "python-abi \
python313-FontTools \
python313-fs"

inherit rpm
