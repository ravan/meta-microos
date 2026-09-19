SUMMARY = "Universal encoding detector"
DESCRIPTION = "Universal character encoding detector \
------------------------------------- \
 \
Detects \
 - ASCII, UTF-8, UTF-16 (2 variants), UTF-32 (4 variants) \
 - Big5, GB2312, EUC-TW, HZ-GB-2312, ISO-2022-CN (Traditional and Simplified Chinese) \
 - EUC-JP, SHIFT_JIS, ISO-2022-JP (Japanese) \
 - EUC-KR, ISO-2022-KR (Korean) \
 - KOI8-R, MacCyrillic, IBM855, IBM866, ISO-8859-5, windows-1251 (Cyrillic) \
 - ISO-8859-2, windows-1250 (Hungarian) \
 - ISO-8859-5, windows-1251 (Bulgarian) \
 - windows-1252 (English) \
 - ISO-8859-7, windows-1253 (Greek) \
 - ISO-8859-8, windows-1255 (Visual and Logical Hebrew) \
 - TIS-620 (Thai) \
 \
Requires Python 2.1 or later \
 \
Command-line Tool \
----------------- \
 \
chardet comes with a command-line script which reports on the encodings of one \
or more files:: \
 \
    % chardetect.py somefile someotherfile \
    somefile: windows-1252 with confidence 0.5 \
    someotherfile: ascii with confidence 1.0"
LICENSE = "LGPL-2.1-or-later"

PV = "6.0.0.post1"

RPM_NAME = "python313-chardet-6.0.0.post1-1.3.noarch.rpm"
RPM_HASH = "c4e3b0412fb168c72e5190835515af4cd971b819b49a32a3e5f28ea9d18a031c39ea518519cafcbdec33dca48c9b020c87f244035f5261ae988e8e599eb2a4ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-chardet \
python3.13dist-chardet \
python313-chardet \
python3dist-chardet"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
