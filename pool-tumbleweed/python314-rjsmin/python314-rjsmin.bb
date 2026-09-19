SUMMARY = "A JavaScript minifier written in Python"
DESCRIPTION = "rJSmin is a Javascript minifier written in Python. \
 \
The minifier is based on the semantics of jsmin.c by Douglas Crockford. \
 \
The module is a re-implementation targeting speed, so it can be used \
at runtime (rather than during a preprocessing step)."
LICENSE = "Apache-2.0"

PV = "1.2.5"

RPM_NAME = "python314-rjsmin-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "fff80ac13f699bbea917711a7556f15378b55a6445c383d0b207a82fbf0ceadb418f383083b8d747469248e9648122cd7017200ea087cbbf65cc7206dc8a2141"

RPROVIDES:${PN} += "python3.14dist-rjsmin \
python314-rjsmin \
python3dist-rjsmin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
