SUMMARY = "Tools to manipulate MIME messages"
DESCRIPTION = "Tools to manipulate MIME messages"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "5.518.0"

RPM_NAME = "perl-MIME-tools-5.518.0-1.1.noarch.rpm"
RPM_HASH = "3d73a5374853013eb003b7e1468c5274112aab00e39516a78640d2916039750e95de9775ca7f32853ead816d02d60645570c631863bddc75babb2edcbe3d6c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-MIME--Body \
perl-MIME--Body--File \
perl-MIME--Body--InCore \
perl-MIME--Body--Scalar \
perl-MIME--Decoder \
perl-MIME--Decoder--Base64 \
perl-MIME--Decoder--BinHex \
perl-MIME--Decoder--Binary \
perl-MIME--Decoder--Gzip64 \
perl-MIME--Decoder--NBit \
perl-MIME--Decoder--QuotedPrint \
perl-MIME--Decoder--UU \
perl-MIME--Entity \
perl-MIME--Field--ConTraEnc \
perl-MIME--Field--ContDisp \
perl-MIME--Field--ContType \
perl-MIME--Field--ParamVal \
perl-MIME--Head \
perl-MIME--Parser \
perl-MIME--Parser--FileInto \
perl-MIME--Parser--FileUnder \
perl-MIME--Parser--Filer \
perl-MIME--Parser--Reader \
perl-MIME--Parser--Results \
perl-MIME--Tools \
perl-MIME--WordDecoder \
perl-MIME--WordDecoder--ISO-8859 \
perl-MIME--WordDecoder--US-ASCII \
perl-MIME--WordDecoder--UTF-8 \
perl-MIME--Words \
perl-MIME-tools"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--Temp \
perl-Mail--Field \
perl-Mail--Header \
perl-Mail--Internet"

inherit rpm
