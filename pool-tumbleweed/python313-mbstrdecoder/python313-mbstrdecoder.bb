SUMMARY = "Multi-byte character string decoder"
DESCRIPTION = "Python library for multi-byte character string decoding."
LICENSE = "MIT"

PV = "1.1.5"

RPM_NAME = "python313-mbstrdecoder-1.1.5-1.2.noarch.rpm"
RPM_HASH = "f268c45fe6fbecc3c51dcaba9f47ebaa9ec14bd833ece80a58a68078e43711d4bb48821a109e26c7d189d6d5153d19a9b6ee43bca110837050f031f86a7bbd50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mbstrdecoder \
python3.13dist-mbstrdecoder \
python313-mbstrdecoder \
python3dist-mbstrdecoder"

RDEPENDS:${PN} += "python-abi \
python313-chardet"

inherit rpm
