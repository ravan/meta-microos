SUMMARY = "Python implementation of the lex and yacc tools"
DESCRIPTION = "SLY is a 100% Python implementation of the lex and yacc tools commonly used to write parsers and compilers. Parsing is based on the same LALR(1) algorithm used by many yacc tools. Here are a few notable features: \
* SLY provides very extensive error reporting and diagnostic information to assist in parser construction. The original implementation was developed for instructional purposes. As a result, the system tries to identify the most common types of errors made by novice users. \
* SLY provides full support for empty productions, error recovery, precedence specifiers, and moderately ambiguous grammars. \
* SLY uses various Python metaprogramming features to specify lexers and parsers. There are no generated files or extra steps involved. You simply write Python code and run it. \
* SLY can be used to build parsers for 'real' programming languages. Although it is not ultra-fast due to its Python implementation, SLY can be used to parse grammars consisting of several hundred rules (as might be found for a language like C)."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python314-sly-0.5-1.12.noarch.rpm"
RPM_HASH = "94392ee09ce6c49831c395eba20cb6fa83ff14a5df86baff864b2eac8a7519a4f66a74584cf7d58349180bf4238525c00b8a54c4c2bde2c07d44fc6f4c52c29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sly \
python314-sly \
python3dist-sly"

RDEPENDS:${PN} += "python-abi"

inherit rpm
