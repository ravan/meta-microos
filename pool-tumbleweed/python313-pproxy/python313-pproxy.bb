SUMMARY = "Proxy server that can tunnel among remote servers by regex rules"
DESCRIPTION = "Proxy server that can tunnel among remote servers by regex rules."
LICENSE = "MIT"

PV = "2.7.8"

RPM_NAME = "python313-pproxy-2.7.8-6.2.noarch.rpm"
RPM_HASH = "0d259540105c1f9a92b121deeefb2f38ff2393585d4789bf9fb95f6e6ee3433999c0f2248ad99db7e425aa0c41c55cba6f8032bda655f87b6989f417150c1bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pproxy \
python3.13dist-pproxy \
python313-pproxy \
python3dist-pproxy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
