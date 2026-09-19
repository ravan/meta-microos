SUMMARY = "Module to align text"
DESCRIPTION = "Text::Aligner exports a single function, align(), which is used to justify \
strings to various alignment styles. The alignment specification is the \
first argument, followed by any number of scalars which are subject to \
alignment. \
 \
The operation depends on context. In list context, a list of the justified \
scalars is returned. In scalar context, the justified arguments are joined \
into a single string with newlines appended. The original arguments remain \
unchanged. In void context, in-place justification is attempted. In this \
case, all arguments must be lvalues. \
 \
Align() also does one level of scalar dereferencing. That is, whenever one \
of the arguments is a scalar reference, the scalar pointed to is aligned \
instead. Other references are simply stringified. An undefined argument is \
interpreted as an empty string without complaint. \
 \
Alignment respects colorizing escape sequences a la Term::ANSIColor which \
means it knows that these sequences don't take up space on the screen."
LICENSE = "SUSE-Public-Domain"

PV = "0.16"

RPM_NAME = "perl-Text-Aligner-0.16-1.29.noarch.rpm"
RPM_HASH = "496f5e851251f637b371e5002ab685725752f9a150b5901b91177c881849041607c30bc569d0aca275790d367b02f5e8cbeba3bd87612643f183a9c75e6006f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--Aligner \
perl-Text--Aligner--Auto \
perl-Text--Aligner--MaxKeeper \
perl-Text-Aligner"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Term--ANSIColor"

inherit rpm
