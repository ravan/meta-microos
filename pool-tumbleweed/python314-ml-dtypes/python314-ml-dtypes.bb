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

RPM_NAME = "python314-ml-dtypes-0.5.4-2.5.aarch64.rpm"
RPM_HASH = "4afc6ac63dc8b284928ad89c8f388028aea9ca3532ab34d287e254b61c8b0d41af0fc18c67702e466891471e84cd45b30c5db2533a452d817306eb506de9041a"

RPROVIDES:${PN} += "python3.14dist-ml-dtypes \
python314-ml-dtypes \
python3dist-ml-dtypes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
