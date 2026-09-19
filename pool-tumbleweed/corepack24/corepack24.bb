SUMMARY = "Helper bridge between NodeJS projects and their dependencies"
DESCRIPTION = "Zero-runtime-dependency package acting as bridge between Node projects \
and their package managers."
LICENSE = "MIT"

PV = "24.18.1"

RPM_NAME = "corepack24-24.18.1-1.1.aarch64.rpm"
RPM_HASH = "43e384bb3b63d8a01cfc5bd65a39793bc684acd9009abbda798b0eeac5d9cd65852853ebb09b4c973aa258628c836b95e7240553c4256668f05326428a6d78f5"

RPROVIDES:${PN} += "corepack24"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
nodejs-common"

inherit rpm
