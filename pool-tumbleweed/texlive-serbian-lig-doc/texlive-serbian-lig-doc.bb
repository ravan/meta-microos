SUMMARY = "Documentation for texlive-serbian-lig"
DESCRIPTION = "This package includes the documentation for texlive-serbian-lig"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn53127"

RPM_NAME = "texlive-serbian-lig-doc-2026.226.svn53127-60.2.noarch.rpm"
RPM_HASH = "b26817df3975d2bee2ade02e963013fadfa820121518be444ddb634dc2245c1c95f94a22bffce60dac9ca8edfd5bc0bc236a4bb5cfa13848a3a32ab9bf562fd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-lig-doc"

RDEPENDS:${PN} += ""

inherit rpm
