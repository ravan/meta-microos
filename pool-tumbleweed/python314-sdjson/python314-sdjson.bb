SUMMARY = "Custom JSON Encoder utilising functools.singledispatch"
DESCRIPTION = "Custom JSON Encoder for Python utilising functools.singledispatch to support \
custom encoders for both Python's built-in classes and user-created classes, \
without as much legwork."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-sdjson-0.5.0-3.6.noarch.rpm"
RPM_HASH = "05f69292bf13720fa0f79fbaf693d040e8806eff929160851429a59f556a8c598acbc76c7f72646103bf0495130ad253bf7a136d6db1d57fbcc5afb9473305d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sdjson \
python314-sdjson \
python3dist-sdjson"

RDEPENDS:${PN} += "python-abi \
python314-domdf-python-tools \
python314-typing-extensions"

inherit rpm
