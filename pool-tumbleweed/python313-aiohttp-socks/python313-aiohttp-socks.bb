SUMMARY = "SOCKS proxy connector for aiohttp"
DESCRIPTION = "SOCKS proxy connector for aiohttp"
LICENSE = "Apache-2.0"

PV = "0.12.0"

RPM_NAME = "python313-aiohttp-socks-0.12.0-1.1.noarch.rpm"
RPM_HASH = "4dcf14b525271b92e0fd8a6863f2e8cb89351589df08dcbaf09510d2f07cab8a6469b0d72039ab406867de69fe6b762c028fb26b37fdd30fb7ba904b75951201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiohttp-socks \
python3.13dist-aiohttp-socks \
python313-aiohttp-socks \
python3dist-aiohttp-socks"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-python-socks"

inherit rpm
