SUMMARY = "XCCDF files for SUSE Linux and openSUSE"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for SUSE Linux. \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on SLE12, SLE15, SLE16, SLEM5, SLEM6 and openSUSE \
 \
SUSE supported in this version of scap-security-guide: \
 \
- DISA STIG profile for SUSE Linux Enterprise Server 12 and 15 \
- DISA STIG profile for SUSE Linux Enterprise Micro 5 \
- ANSSI-BP-028 profile for SUSE Linux Enterprise Server 12 and 15 \
- PCI-DSS profile for SUSE Linux Enterprise Server 12, 15 and 16 \
- HIPAA profile for SUSE Linux Enterprise Server 12, 15 and 16 \
- Hardening for Public Cloud Image of SUSE Linux Enterprise Server for SAP Applications 15 \
- Public Cloud Hardening for SUSE Linux Enterprise 15 \
 \
Other profiles, like the Standard System Security Profile for SUSE Linux Enterprise 12 and 15, \
are community supplied and not officially supported by SUSE."
LICENSE = "BSD-3-Clause"

PV = "0.1.81"

RPM_NAME = "scap-security-guide-0.1.81-1.3.noarch.rpm"
RPM_HASH = "009d0c5904b63f88aa0f352cb85eb8822d3534fd5c315b9bdd46b5e417d6b8cc725a4259b0cf7cd44516e997ffcaca899fd1d1f9999bde5955a2f5b7f9172be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide"

RDEPENDS:${PN} += "coreutils \
findutils \
gawk \
grep \
sed \
sudo \
zypper"

inherit rpm
