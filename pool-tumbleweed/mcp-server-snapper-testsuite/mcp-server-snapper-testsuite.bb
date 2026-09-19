SUMMARY = "Testsuite for package mcp-server-snapper"
DESCRIPTION = "Testsuite for package mcp-server-snapper \
 \
Note: This package is for testing purposes only. It is intended for \
use by quality assurance and requires a dedicated testing environment. \
 \
Do not install on a production system!"
LICENSE = "MIT & BSD-2-Clause & BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "mcp-server-snapper-testsuite-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "5a44581c3e9f8792a2a663531deb2c051619cd5205183e8c7f04621c3433fd0a9feb8c65b22c0104929b6f6558d66b1060bfcf568744389c7bcec58bd9bcfff7"

RPROVIDES:${PN} += "mcp-server-snapper-testsuite"

RDEPENDS:${PN} += "mcp-server-snapper"

inherit rpm
