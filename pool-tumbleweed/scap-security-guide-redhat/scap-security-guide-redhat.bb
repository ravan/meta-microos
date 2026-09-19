SUMMARY = "XCCDF files for RHEL, CentOS, Fedora, ScientificLinux and AlmaLinux"
DESCRIPTION = "Security Content Automation Protocol (SCAP) Security Guide for Redhat/Fedora/CentOS/OracleLinux/ScientificLinux/AlmaLinux \
 \
This package contains XCCDF (Extensible Configuration Checklist \
Description Format), OVAL (Open Vulnerability and Assessment \
Language), CPE (Common Platform Enumeration) and DS (Data Stream) \
files to run a compliance test on various Redhat products, CentOS, Oracle Linux, Fedora and ScientificLinux. \
 \
Note that the included profiles are community supplied and not officially supported by SUSE.."
LICENSE = "BSD-3-Clause"

PV = "0.1.81"

RPM_NAME = "scap-security-guide-redhat-0.1.81-1.3.noarch.rpm"
RPM_HASH = "19ea134a466a6d95c47b2245db85fa8975a9ebde540a91995b7308f6d30799db8fd2cdeadba9ae7c78a1b55a394acb2e277d90741a85d67debb949e732494e84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "scap-security-guide-redhat"

RDEPENDS:${PN} += ""

inherit rpm
