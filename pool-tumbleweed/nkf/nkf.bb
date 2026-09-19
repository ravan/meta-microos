SUMMARY = "Network Kanji Code Conversion Filter"
DESCRIPTION = "Nkf is a yet another Kanji code converter among networks, hosts, and \
terminals. It converts input Kanji code to designated Kanji code, such \
as 7-bit JIS, MS-kanji (shifted-JIS) or EUC. \
 \
One of the most unique facility of nkf is the guess of the input kanji \
code.  It currently recognizes 7-bit JIS, MS-kanji (shifted-JIS), and \
EUC. So users do not need the input Kanji code specification. \
 \
By  default,  X0201  kana is converted into X0208 kana. For X0201 kana, \
SO/SI, SSO and ESC-(-I methods are  supported. For automatic code \
detection, nkf assumes no X0201 kana in MS-Kanji. To accept X0201 in \
MS-Kanji, use -X, -x, or -S."
LICENSE = "BSD-3-Clause"

PV = "2.1.5"

RPM_NAME = "nkf-2.1.5-1.37.aarch64.rpm"
RPM_HASH = "2957796e334f2c881b9b98d3516b53093fa36f3ce0f969df401fe053c4e108c5ce3d554731c10c5a8c0fd5b90b91762234cdc5cf88d983537b370e99612703ef"

RPROVIDES:${PN} += "locale-ja \
nkf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl"

inherit rpm
