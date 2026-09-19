SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.2"

RPM_NAME = "python313-rarfile-4.2-3.5.noarch.rpm"
RPM_HASH = "eb50847c9dbb1ccc40b5581c98628faa99646ef6cb076e3ee8f82d242a9f9535e54117ebf172dc2e45a411c4e0a0a28642cf4517952ce9c006d8288a64deed71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rarfile \
python3.13dist-rarfile \
python313-rarfile \
python3dist-rarfile"

RDEPENDS:${PN} += "bsdtar \
python-abi"

inherit rpm
