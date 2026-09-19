SUMMARY = "CLI tool for linting and testing Helm charts"
DESCRIPTION = "ct is the the tool for testing Helm charts. It is meant to be used for linting and testing pull requests. It automatically detects charts changed against the target branch."
LICENSE = "Apache-2.0"

PV = "3.14.0"

RPM_NAME = "chart-testing-3.14.0-1.8.aarch64.rpm"
RPM_HASH = "300b27bcc7a7149d0b85b4b53c81da077e85051a2e0c5ded7e3d1ac3171204b02c27092147c7f148c85ec593a31a59a8b604b97fd52f8067aa2a4139fcd9ac46"

RPROVIDES:${PN} += "chart-testing"

RDEPENDS:${PN} += "git-core \
helm \
libc.so.6 \
python3-yamale \
python3-yamllint"

inherit rpm
