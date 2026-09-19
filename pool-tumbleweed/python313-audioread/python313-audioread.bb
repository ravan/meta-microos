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

RPM_NAME = "python313-audioread-3.1.0-1.4.noarch.rpm"
RPM_HASH = "ae928dfa3eca59b05f4ee8af281b45242d907e4b410cf4405e20522841980e890fe0cc7e755291b2ad4f57b4eee59fa17cde30655da4fe3a31ad10ab49d99501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-audioread \
python3.13dist-audioread \
python313-audioread \
python3dist-audioread"

RDEPENDS:${PN} += "python-abi \
python313-standard-aifc \
python313-standard-sunau"

inherit rpm
