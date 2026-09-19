SUMMARY = "LTS Port of Python audioop"
DESCRIPTION = "LTS Port of Python audioop"
LICENSE = "PSF-2.0"

PV = "0.2.2"

RPM_NAME = "python313-audioop-lts-0.2.2-2.6.aarch64.rpm"
RPM_HASH = "56d87135a07398b40a163a26e5f4f6d5d87ab5e4c202ea38394b865f11cdd4ab630246543a8564d66ad73fde617b066db5322f2656b976b1f8c97a9033ef8d69"

RPROVIDES:${PN} += "python3-audioop-lts \
python3.13dist-audioop-lts \
python313-audioop-lts \
python3dist-audioop-lts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
