SUMMARY = "Manipulate well-formed Roman numerals"
DESCRIPTION = "A library for manipulating well-formed Roman numerals."
LICENSE = "0BSD"

PV = "4.1.0"

RPM_NAME = "python313-roman-numerals-4.1.0-1.3.noarch.rpm"
RPM_HASH = "d72767cb5858de9eb0af47d8e039bae0abda6c0b9a89813bae26d427e94c27202c265ef7a783bde6321305cee02feed96d13e4e2ebbadd962d5d95ec6b523e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-roman-numerals \
python3.13dist-roman-numerals \
python313-roman-numerals \
python3dist-roman-numerals"

RDEPENDS:${PN} += "python-abi"

inherit rpm
