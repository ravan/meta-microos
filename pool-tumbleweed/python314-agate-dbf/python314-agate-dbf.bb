SUMMARY = "Read support for dbf files for agate"
DESCRIPTION = "Agate-dbf adds read support for dbf files to agate."
LICENSE = "MIT"

PV = "0.2.4"

RPM_NAME = "python314-agate-dbf-0.2.4-1.4.noarch.rpm"
RPM_HASH = "b0413296b93ff7ec8b3342f4987ea1006bd762222ce45e21d6903e0866ac5cf8d778ae847cabd528aa90273673bf7c5cd7a829b994b462219247e0275f6ff441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-agate-dbf \
python314-agate-dbf \
python3dist-agate-dbf"

RDEPENDS:${PN} += "python-abi \
python314-agate \
python314-dbfread"

inherit rpm
