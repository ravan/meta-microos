SUMMARY = "XCCDF files for Debian"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Debian. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on Debian. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.81"

RPM_NAME = "scap-security-guide-debian-0.1.81-1.3.noarch.rpm"
RPM_HASH = "05dbd50b5cdc0aa7f551264eaa4b94c35a15473f7b4c74c09c85707a567c816814a6df916051d184e93c9807a7aa6282e6ed8febc8d2ea0ca6faff6252144cea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-debian"

RDEPENDS:${PN} += ""

inherit rpm
