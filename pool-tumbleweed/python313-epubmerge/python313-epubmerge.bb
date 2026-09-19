SUMMARY = "EpubMerge Calibre Plugin"
DESCRIPTION = "This plugin provides the ability to create new EPUBs by combining the contents \
of existing (non-DRM) EPUB format eBooks. \
 \
Main Features of EpubMerge Plugin: \
    - Select a list of stories in calibre, \
    - Order them, \
    - Edit the metadata for the new combined eBook, and then, \
    - Merge the contents of the EPUBs together into the new eBook, now \
      including cover from metadata if set. \
    - UnMerge previously merged epubs if metadata was saved during merge. \
    - Configurably able to save the metadata for each merged book for UnMerging \
      later if desired. (Defaults to On.) \
    - Configurably able to populate custom columns from source books. \
    - Options now stored inside the Library rather than an external JSON file. \
    - CLI \
 \
There are a few configurable options: whether or not to insert a Table of \
Contents entry for each merged book (with it's original TOC nested underneath \
it), an option to flatten the TOC down to one level only, and including the \
merged books comments. These options are stored by Library."
LICENSE = "GPL-3.0-only"

PV = "3.2.0"

RPM_NAME = "python313-epubmerge-3.2.0-1.5.noarch.rpm"
RPM_HASH = "bc1ff6c505c4a2c07e3ff4218ae16c6375bee78cba70f949e704f34971008dadc4ea1102c8931cbff854d615b7a345c2799611ae2045b850391d3c225d330d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-epubmerge \
python3.13dist-epubmerge \
python313-epubmerge \
python3dist-epubmerge"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-six \
update-alternatives"

inherit rpm
