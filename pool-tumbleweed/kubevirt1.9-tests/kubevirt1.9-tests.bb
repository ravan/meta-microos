SUMMARY = "Kubevirt functional tests"
DESCRIPTION = "The package provides Kubevirt end-to-end tests."
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-tests-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "b390a2cb81d0a38d48caed4ba1dd48c79383077dfe9586ca5b3052568d759b217101bac1077148c4ebf62d059cb0ed0fd4508f5b6d79ae354f5f5fd30e360afb"

RPROVIDES:${PN} += "kubevirt-tests \
kubevirt1.9-tests"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
