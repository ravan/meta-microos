SUMMARY = "File Locator and Interpreter for Python"
DESCRIPTION = "EditorConfig Python Core provides the same functionality as the \
EditorConfig C Core. EditorConfig Python core can be used as a \
command line program or as an importable library."
LICENSE = "BSD-2-Clause & Python-2.0"

PV = "0.17.1+git.1766559334.7ccd8d6"

RPM_NAME = "python314-EditorConfig-0.17.1+git.1766559334.7ccd8d6-1.4.noarch.rpm"
RPM_HASH = "a010c1421705643c2457afabf8818a5489c7dc967a6b7956be0d7eb3e5a56f7a7b5087ee721282721dfa867e550c029e798fafcd0f1ea8e7891de81565665606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-editorconfig \
python314-EditorConfig \
python3dist-editorconfig"

RDEPENDS:${PN} += "python-abi"

inherit rpm
