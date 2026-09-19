SUMMARY = "Stand-alone implementation of several NumPy dtype extensions"
DESCRIPTION = "`ml_dtypes` is a stand-alone implementation of several NumPy dtype extensions used in machine learning libraries, including: \
 \
- [`bfloat16`](https://en.wikipedia.org/wiki/Bfloat16_floating-point_format): \
  an alternative to the standard [`float16`](https://en.wikipedia.org/wiki/Half-precision_floating-point_format) format \
- `float8_*`: several experimental 8-bit floating point representations \
  including: \
  * `float8_e3m4` \
  * `float8_e4m3` \
  * `float8_e4m3b11fnuz` \
  * `float8_e4m3fn` \
  * `float8_e4m3fnuz` \
  * `float8_e5m2` \
  * `float8_e5m2fnuz` \
- Microscaling (MX) sub-byte floating point representations including: \
  * `float4_e2m1fn` \
  * `float6_e2m3fn` \
  * `float6_e3m2fn` \
- `int2`, `int4`, `uint2` and `uint4`: low precision integer types."
LICENSE = "Apache-2.0"

PV = "0.5.4"

RPM_NAME = "python313-ml-dtypes-0.5.4-2.5.aarch64.rpm"
RPM_HASH = "187a40cf29b1c6c32f9a4db49389e019f78953c9e958b0e44a377afe26d07a4f2a541f1687a5a464e4d067b93fa0daeb463e83237ef92fdd4ca5f48be742364c"

RPROVIDES:${PN} += "python3-ml-dtypes \
python3.13dist-ml-dtypes \
python313-ml-dtypes \
python3dist-ml-dtypes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
