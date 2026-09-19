SUMMARY = "OpenStack serialization library"
DESCRIPTION = "The oslo.serialization library provides support for representing objects \
in transmittable and storable formats, such as Base64, JSON and MessagePack."
LICENSE = "Apache-2.0"

PV = "5.11.0"

RPM_NAME = "python313-oslo.serialization-5.11.0-1.1.noarch.rpm"
RPM_HASH = "7885def0b28672be8734c89af706f88816aee23a545a4806ac81c10a7036f0d192c19362e3a68228861b167c90b634bdf3c87fe677bd43505009a9e3fb683f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.serialization \
python3.13dist-oslo.serialization \
python313-oslo.serialization \
python3dist-oslo.serialization"

RDEPENDS:${PN} += "python-abi \
python313-msgpack \
python313-oslo.utils"

inherit rpm
