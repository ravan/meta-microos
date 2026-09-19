SUMMARY = "XCCDF files for Ubuntu"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Ubuntu. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on Ubuntu. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.81"

RPM_NAME = "scap-security-guide-ubuntu-0.1.81-1.3.noarch.rpm"
RPM_HASH = "df65db69a966514da30d09184b4fba25e307a707249e1774e085df9e283678728f9b662c27468f1109177b424945fdebfebded2c02714c7666490ed541b08b8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-ubuntu"

RDEPENDS:${PN} += ""

inherit rpm
