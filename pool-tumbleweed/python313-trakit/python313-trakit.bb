SUMMARY = "Guess additional information from track titles"
DESCRIPTION = "TrakIt is a track name parser created to solve a common, yet very specific \
problem, that is vagueness in metadata information."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "python313-trakit-0.2.5-1.3.noarch.rpm"
RPM_HASH = "7732964cf36338daa1d703f2f8f6d254b8867e078f9737c0e16102c5a2b7c11a9339d812834ed1aca1fc52da69caaac5b3c8a9eafbf80ba0dfe27e6e61679123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-trakit \
python3.13dist-trakit \
python313-trakit \
python3dist-trakit"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-babelfish \
python313-rebulk \
update-alternatives"

inherit rpm
