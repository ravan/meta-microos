SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.2"

RPM_NAME = "python314-rarfile-4.2-3.5.noarch.rpm"
RPM_HASH = "1a6fe11c69b40f3f32ca0ade98dd2dfeb610c5b91d0a638784ac9f4389cd76887fa8e433d9ed0ea45e545473677c36a4dc2265dd21f4890384b9d763756f2e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-rarfile \
python314-rarfile \
python3dist-rarfile"

RDEPENDS:${PN} += "bsdtar \
python-abi"

inherit rpm
