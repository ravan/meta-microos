SUMMARY = "CDI containers meta information (build service)"
DESCRIPTION = "The package provides meta information that is used during the build of \
the CDI container images."
LICENSE = "Apache-2.0"

PV = "1.66.1"

RPM_NAME = "obs-service-cdi1.66_containers_meta-1.66.1-1.1.aarch64.rpm"
RPM_HASH = "f79ebec49996f1937544ba4801017cb988aba8843a4f0ad48767b363252e302420e0b1fb947ed061198ba58d90988a2db961115dca0f966823532324b76d24b7"

RPROVIDES:${PN} += "obs-service-cdi1.66-containers-meta"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
