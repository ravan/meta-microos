SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "python313-rjsmin-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "2dc0f7c0b17c31c78971df38337713cb7b15922f61889ff39e43b5e7c59227119a8f01323abdc0fdcddb0378e108643c55e9381c4aed0c3fd5e9012156779024"

RPROVIDES:${PN} += "python3-rjsmin \
python3.13dist-rjsmin \
python313-rjsmin \
python3dist-rjsmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
