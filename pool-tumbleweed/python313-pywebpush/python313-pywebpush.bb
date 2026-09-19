SUMMARY = "WebPush publication library"
DESCRIPTION = "WebPush publication library."
LICENSE = "MPL-2.0"

PV = "2.1.0"

RPM_NAME = "python313-pywebpush-2.1.0-1.4.noarch.rpm"
RPM_HASH = "2f34123aacd1dd1dee5599e0039a7c273dedf5012bace7a1e309444831eaad7e68a0bc18d3e08a2608466a9bd2c72dd340519bfd3a7f47a3e6509dfb0608f998"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pywebpush \
python3.13dist-pywebpush \
python313-pywebpush \
python3dist-pywebpush"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-aiohttp \
python313-cryptography \
python313-http-ece \
python313-py-vapid \
python313-requests \
update-alternatives"

inherit rpm
