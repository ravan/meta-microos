SUMMARY = "Wrapper for audio decoding via selectable backends"
DESCRIPTION = "Decode audio files using whichever backend is available. The library \
currently supports: \
 \
- Gstreamer via PyGObject. \
- MAD via the pymad bindings. \
- FFmpeg or Libav via its command-line interface. \
- The standard library wave, aifc, and sunau modules (for \
  uncompressed audio formats)."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-audioread-3.1.0-1.4.noarch.rpm"
RPM_HASH = "58f8c2bc2e96262fdfc06e9f9641cf991e91074be1316a542ccf74eadbc41229fe352a7370d80925a4fdeb9344d0af91fa41cc34ec4554301883c0604c447a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-audioread \
python314-audioread \
python3dist-audioread"

RDEPENDS:${PN} += "python-abi \
python314-standard-aifc \
python314-standard-sunau"

inherit rpm
