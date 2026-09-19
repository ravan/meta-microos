SUMMARY = "Documentation files to support the YARA malware identification tool"
DESCRIPTION = "Documentation and guideslines to support YARA. \
 \
YARA is a tool aimed at helping malware researchers to identify and classify \
malware samples. With YARA you can create descriptions of malware families \
based on textual or binary patterns contained on samples of those families. \
Each description consists of a set of strings and a Boolean expression which \
determines its logic."
LICENSE = "BSD-3-Clause"

PV = "4.5.5"

RPM_NAME = "yara-doc-4.5.5-1.4.noarch.rpm"
RPM_HASH = "ae26b09e19876ed2bb6076688417fbad49c7e59d9461b6e910096d9d81182ee4f3998a903cc7acb48f24f21ca480dfb48e96065ecee5f5a9a489b7059b8728ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yara-doc"

RDEPENDS:${PN} += "libyara10"

inherit rpm
