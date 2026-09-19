SUMMARY = "Documentation files for the ddskk package"
DESCRIPTION = "SKK (Simple Kana to Kanji conversion program) is a Japanese input \
method for Emacs. ddskk-doc contains Changelogs and Readme files."
LICENSE = "GPL-2.0-or-later & SUSE-Permissive & SUSE-Public-Domain"

PV = "20250328"

RPM_NAME = "ddskk-doc-20250328-3.4.noarch.rpm"
RPM_HASH = "9bff9dfd5092bbab7b688e45c1b3221200a02d82d90ccaebbcdff41f7b4e3aac6167b2e73ce3e2f55ad924563fe813bd00f202e639187bb87bf5f3cbdb5d4bdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddskk-doc"

RDEPENDS:${PN} += "ddskk"

inherit rpm
