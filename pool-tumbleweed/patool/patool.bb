SUMMARY = "Portable Command Line Archive File Manager"
DESCRIPTION = "patool is a portable command line archive file manager. Various archive types \
can be created, extracted, tested and listed by patool. \
The advantage of patool is its simplicity in handling archive files without \
having to remember a myriad of programs and options. \
The archive format is determined by the file(1) program and as a fallback by \
the archive file extension. \
 \
patool supports 7z (.7z), ACE (.ace), ALZIP (.alz), AR (.a), ARC (.arc), ARJ \
(.arj), BZIP2 (.bz2), CAB (.cab), compress (.Z), CPIO (.cpio), DEB (.deb), GZIP \
(.gz), LRZIP (.lrz), LZH (.lha, .lzh), LZIP (.lz), LZMA (.lzma), LZOP (.lzo), \
RPM (.rpm), RAR (.rar), TAR (.tar), XZ (.xz), and ZIP (.zip, .jar) formats. \
 \
It relies on helper applications to handle those archive formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.0"

RPM_NAME = "patool-4.1.0-1.1.noarch.rpm"
RPM_HASH = "2b123ba7fd54cfa09528305814ab8bfbf1c070e76ccb6f9b9c8a23a9ed2b085e32bc79b55b1f8a60db368a0fbfb2ed64c9b24ddb5db7aad6a99583ea92208ecf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "patool \
patool-bash-completion \
python3.13dist-patool \
python3dist-patool"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
