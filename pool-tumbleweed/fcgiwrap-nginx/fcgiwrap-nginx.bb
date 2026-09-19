SUMMARY = "System services for using fcgiwrap with nginx"
DESCRIPTION = "This package provides systemd unit files to run a set of fcgiwrap \
processes ready for use with nginx or other web servers."
LICENSE = "MIT"

PV = "1.1.0+18+g99c942c"

RPM_NAME = "fcgiwrap-nginx-1.1.0+18+g99c942c-3.23.aarch64.rpm"
RPM_HASH = "3802b20b02d2b5f729bca78d4987967ade38ff9a402b878d23abf748b8c8fef2d2c9325c572e8f00dfbec931377677d981e2f1c22d4f343ac94c95d34ef08b0c"

RPROVIDES:${PN} += "fcgiwrap-nginx"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
fcgiwrap \
nginx"

inherit rpm
