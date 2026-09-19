SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.17.1+git.1766559334.7ccd8d6"

RPM_NAME = "python313-EditorConfig-0.17.1+git.1766559334.7ccd8d6-1.4.noarch.rpm"
RPM_HASH = "40553c4df05d5283efd54217bcf1796f6fd45c81f97f21eb10d0a843329998634ef4da94337d093e57ef0e1f7239ba281eadb68ae1dcfdf351b3cfeb7d12799a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-EditorConfig \
python3.13dist-editorconfig \
python313-EditorConfig \
python3dist-editorconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
